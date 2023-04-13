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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: fixed; overflow-y: auto; overflow: hidden;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout id="layoutCabecera" style="width: 100%; z-index: 999; background-color: #757575;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="flex-grow: 1; align-self: stretch; flex-shrink: 0; z-index: 0; width: 100%;overflow: hidden;" theme="spacing-s">
  <vaadin-vertical-layout id="layoutCabeceraTop" style="flex-shrink: 1; flex-grow: 0; z-index: 1; align-items: center; justify-content: flex-start; align-self: stretch; background-color: #757575; width: 10%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutListaPublicaciones" style="flex-grow: 1; flex-shrink: 0; align-items: center; background-color: #ffffff; align-self: stretch; justify-content: center; z-index: 0; margin: var(--lumo-space-l); margin-left: var(--lumo-space-xl); margin-top: 4%;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
