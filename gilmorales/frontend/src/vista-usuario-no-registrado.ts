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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="layoutCabecera" style="align-self: stretch;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing-s" id="vaadinHorizontalLayout" style="flex-grow: 1; align-self: stretch; margin: var(--lumo-space-s);">
  <vaadin-vertical-layout id="layoutCabeceraTop"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutListaPublicaciones" style="flex-grow: 1;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
