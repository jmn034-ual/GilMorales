import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-usuario-registrado')
export class VistaUsuarioRegistrado extends LitElement {
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
 <vaadin-horizontal-layout id="cabecera" style="align-self: stretch; align-items: flex-start; flex-shrink: 0; z-index:999;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="flex-grow: 0; position:fixed; width: 100%; margin-top: 60px; flex-shrink: 0; justify-content: flex-start; background-color: #ffffff; display: flex; padding: 0px; height: 100%; overflow-y: auto; scrollbar-color: transparent transparent;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout id="cabeceraTop" style="height: 110%; flex-shrink: 0; margin: 0%; max-width: 190px; z-index: 999; background-color: #C8C4C4; flex-grow: 0; width: 190px; scrollbar-color: transparent transparent; overflow-y: auto;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing-s" id="listaPublicaciones" style="flex-grow: 1; align-items: flex-start; flex-shrink: 0; overflow-y: auto; z-index: 999; scrollbar-width: thin; scrollbar-color: transparent transparent; width: 80%; height: 95%;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
