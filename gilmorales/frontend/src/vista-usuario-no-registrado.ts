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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: fixed; overflow-y: auto; padding: 0%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout id="layoutCabecera" style="align-self: stretch; align-items: flex-start; flex-shrink: 0; z-index:100;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="flex-grow: 1; position:fixed; width: 100%; margin-top: 5%; overflow-y: auto; flex-shrink: 0; height: 90%; justify-content: flex-start; background-color: #ffffff;">
  <vaadin-vertical-layout id="layoutCabeceraTop" style="height: 95%; flex-shrink: 1;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutListaPublicaciones" style="flex-grow: 0; align-items: center; flex-shrink: 1; width: 100%; padding-left: 10%; overflow-y: auto; z-index: 999;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
