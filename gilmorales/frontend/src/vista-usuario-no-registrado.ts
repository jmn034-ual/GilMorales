import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-usuario-no-registrado')
export class VistaUsuarioNoRegistrado extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; position: fixed; overflow-y: auto; padding: 0px; margin: 0px; flex-direction: column; display: flex; justify-content: flex-start;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout id="layoutCabecera" style="align-items: flex-start; flex-shrink: 0; z-index:100; height: 60px; padding: 0px; margin: 0px; width: 100%;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="flex-grow: 0; position:fixed; width: 100%; margin-top: 60px; flex-shrink: 0; justify-content: flex-start; background-color: #ffffff; display: flex; padding: 0px; height: 100%;">
  <vaadin-vertical-layout id="layoutCabeceraTop" style="flex-shrink: 0; margin: 0%; max-width: 190px; z-index: 999; background-color: #C8C4C4; flex-grow: 0; width: 190px; padding-bottom: 0px; padding-top: 0px;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutListaPublicaciones" style="flex-grow: 0; align-items: flex-start; flex-shrink: 0; overflow-y: auto; z-index: 999; scrollbar-width: thin; scrollbar-color: transparent transparent; width: 100%; padding-bottom: var(--lumo-space-xl);"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
